<!DOCTYPE html>
<html>
<head>
    <title>Close this Window</title>
</head>
<body>
    <?php
    // Display error message if set
    if (isset($_SESSION['error_message'])) {
        $message = $_SESSION['error_message'];
        echo "<script>alert('$message');</script>";
        unset($_SESSION['error_message']); // Clear the error message after displaying
    } else {
        $message = "Welcome to the home page.";
    }
    ?>
    <h1><?php echo $message ?></h1>
    <p></p>
    <script>
        var count = 3;
        var countdown = setInterval(function() {
            document.getElementById("countdown").innerHTML = count;
            count--;
            if (count < 0) {
                clearInterval(countdown);
                closeWindow(); // Panggil fungsi untuk menutup jendela
            }
        }, 1000);

        function closeWindow() {
            window.close(); // Menutup jendela saat dipanggil oleh script JavaScript
        }

        // Tambahkan event listener untuk window close event
        window.addEventListener('beforeunload', function() {
            // Kirim permintaan AJAX untuk membersihkan sesi
            var xhr = new XMLHttpRequest();
            xhr.open('GET', 'clear_session.php', true);
            xhr.send();
        });

    </script>
    <p>Closing this tab in <span id="countdown">3</span> seconds...</p>
    <button onclick="closeWindow()">Close Browser</button>
</body>
</html>