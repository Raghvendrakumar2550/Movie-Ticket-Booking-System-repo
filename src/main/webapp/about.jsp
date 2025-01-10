<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Us & Contact Us</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
   

    <!-- About Us Section -->
    <section id="about" class="about-section">
        <h2>About Us</h2>
        <p>
            We are a dedicated team committed to providing the best user experience through our platform. 
            Our mission is to simplify processes and deliver high-quality services to our customers. 
            With a passion for innovation, we continuously strive to improve and meet the expectations of our users.
        </p>
        <p>
            Our team values transparency, trust, and excellence. We believe in building long-lasting relationships 
            with our users, ensuring they have a seamless and enjoyable experience on our platform.
        </p>
    </section>

    <!-- Contact Us Section -->
    <section id="contact" class="contact-section">
        <h2>Contact Us</h2>
        <form action="ContactServlet" method="post">
            <p>
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" placeholder="Enter your name" required>
            </p>
            <p>
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" placeholder="Enter your email" required>
            </p>
            <p>
                <label for="message">Message:</label>
                <textarea id="message" name="message" rows="5" placeholder="Enter your message" required></textarea>
            </p>
            <p>
                <input type="submit" value="Send">
                <input type="reset" value="Clear">
            </p>
        </form>
    </section>

    <!-- Footer -->
    <footer>
        <div class="footer-content">
            <p>&copy; 2024 Your Company Name. All rights reserved.</p>
        </div>
    </footer>

    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
        }

        header {
            background-color: #007bff;
            color: #fff;
            padding: 20px 10px;
            text-align: center;
        }

        header nav ul {
            list-style: none;
            padding: 0;
        }

        header nav ul li {
            display: inline;
            margin: 0 15px;
        }

        header nav ul li a {
            color: #fff;
            text-decoration: none;
        }

        section {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: #333;
            border-bottom: 2px solid #007bff;
            padding-bottom: 10px;
        }

        form p {
            margin-bottom: 15px;
        }

        form label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        form input, form textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        form input[type="submit"], form input[type="reset"] {
            width: auto;
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            margin-right: 10px;
        }

        form input[type="submit"]:hover, form input[type="reset"]:hover {
            background-color: #0056b3;
        }

        footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px 0;
        }
    </style>
</body>
</html>
