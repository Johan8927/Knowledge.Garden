<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Récupération des données du formulaire
    $name = htmlspecialchars($_POST['name']);
    $email = htmlspecialchars($_POST['email']);
    $message = htmlspecialchars($_POST['message']);

    // Affichage des données pour confirmation
    echo "<h1>Merci pour votre message !</h1>";
    echo "<p><strong>Nom :</strong> " . $name . "</p>";
    echo "<p><strong>Email :</strong> " . $email . "</p>";
    echo "<p><strong>Message :</strong><br>" . nl2br($message) . "</p>";
} else {
    echo "<h1>Accès refusé</h1>";
    echo "<p>Vous devez soumettre le formulaire pour voir cette page.</p>";
}
?>
