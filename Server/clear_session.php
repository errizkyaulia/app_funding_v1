<?php
session_start(); // Mulai sesi
// Unset all session variables
$_SESSION = array();
session_destroy(); // Hapus sesi
?>