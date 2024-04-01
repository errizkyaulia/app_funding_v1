<?php
require_once 'connection.php';

// Extract the verification token from the URL
$verificationToken = isset($_GET['token']) ? $_GET['token'] : null;
$error_message = "";

if ($verificationToken) {
    // Validate the token and check expiration
    $result = mysqli_query($con, "SELECT * FROM user WHERE token = '$verificationToken'");

    if (mysqli_num_rows($result) > 0) {
        // Token is valid and not expired, activate the user's account
        mysqli_query($con, "UPDATE user SET accountstate = 'ACTIVE', token = NULL WHERE token = '$verificationToken'");
        
        // Display a success message
        $error_message = "Account successfully activated. You can now log in.";

    } else {
        // Token is invalid, expired, or both
        $error_message = "Invalid token. Please check your email or contact support.";
    }

    // Set the success message in a session
    $_SESSION['error_message'] = $error_message;

    // Redirect to the login page
    header('Location: Home.php');
    exit();
} else {
    // Token is not provided
    $error_message = "could not verify your account.";
    $_SESSION['error_message'] = $error_message;
    // Redirect to the home page
    header('Location: Home.php');
    exit();
}
?>