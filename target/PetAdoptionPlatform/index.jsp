<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BookMyShow</title>
    <link rel="stylesheet" href="styles.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>
<body>
    <header class="header">
        <div class="header-content">
            <img class="logo" src="https://upload.wikimedia.org/wikipedia/commons/1/1b/BookMyShow_logo.png" alt="BookMyShow Logo">
            <h1 class="title">BookMyShow</h1>
        </div>
        <nav class="nav-menu">
            <ul>
                <li><a href="#home">Home</a></li>
                <li><a href="#movies">Movies</a></li>
                <li><a href="#booking">Book Tickets</a></li>
                <li><a href="#about">About Us</a></li>
                <li><a href="#contact">Contact Us</a></li>
            </ul>
        </nav>
    </header>

    <div class="header-search">
        <div class="search-container">
            <input type="text" class="search-input" placeholder="Search Movies...">
            <button id="search-button" class="search-button">Search</button>
        </div>
        <div class="auth-buttons">
            <button class="signup-button"><a href="register.jsp">Signup</a></button>
            <button class="login-button"><a href="login.jsp">Login</a></button>
        </div>
    </div>

    <section class="hero-section">
        <div class="hero-content">
            <h1>Experience Cinema Like Never Before!</h1>
            <p>Book your tickets for the latest movies in just a few clicks.</p>
            <button class="explore-button">Explore Movies</button>
        </div>
    </section>

    <section id="movies">
        <h2>Now Showing</h2>
        <div class="movie-gallery">
            <div class="movie-card">
                <img src="image/images.jpeg" alt="Movie 1">
                <h3>Hridayam</h3>
                <p>Genre: Action</p>
                <button class="book-now">Book Now</button>
            </div>
            <div class="movie-card">
                <img src="image/download.jpeg" alt="Movie 2">
                <h3>Sita Ramam</h3>
                <p>Genre: Comedy</p>
                <button class="book-now">Book Now</button>
            </div>
            <div class="movie-card">
                <img src="image/movie3.jpg" alt="Movie 3">
                <h3>Movie Title 3</h3>
                <p>Genre: Drama</p>
                <button class="book-now">Book Now</button>
            </div>
        </div>
    </section>

    <section id="booking">
        <h2>Book Your Tickets</h2>
        <form class="booking-form">
            <label for="movie">Select Movie:</label>
            <select id="movie" name="movie">
                <option value="movie1">Movie Title 1</option>
                <option value="movie2">Movie Title 2</option>
                <option value="movie3">Movie Title 3</option>
            </select>

            <label for="date">Select Date:</label>
            <input type="date" id="date" name="date" required>

            <label for="time">Select Show Time:</label>
            <select id="time" name="time">
                <option value="10am">10:00 AM</option>
                <option value="1pm">1:00 PM</option>
                <option value="4pm">4:00 PM</option>
                <option value="7pm">7:00 PM</option>
                <option value="10pm">10:00 PM</option>
            </select>

            <label for="seats">Number of Seats:</label>
            <input type="number" id="seats" name="seats" min="1" max="10" required>

            <button type="submit" class="submit-button">Book Now</button>
        </form>
    </section>

    <section id="about">
        <h2>About Us</h2>
        <p>Welcome to BookMyShow, your ultimate destination for booking movie tickets effortlessly. Experience the best cinematic experience with us!</p>
    </section>

    <section id="contact">
        <h2>Contact Us</h2>
        <form class="contact-form">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="message">Message:</label>
            <textarea id="message" name="message" rows="5" required></textarea>

            <button type="submit" class="submit-button">Send</button>
        </form>
    </section>

    <footer class="footer">
        <div class="footer-container">
            <div class="footer-section about">
                <h2>BookMyShow</h2>
                <p>Your go-to platform for booking movie tickets with ease!</p>
            </div>

            <div class="footer-section links">
                <h3>Quick Links</h3>
                <ul>
                    <li><a href="#movies">Movies</a></li>
                    <li><a href="#booking">Book Tickets</a></li>
                    <li><a href="#about">About Us</a></li>
                    <li><a href="#contact">Contact Us</a></li>
                </ul>
            </div>

            <div class="footer-section contact">
                <h3>Contact Us</h3>
                <ul>
                    <li><i class="fas fa-map-marker-alt"></i> 123 Cinema Street, Mumbai, India</li>
                    <li><i class="fas fa-phone-alt"></i> +91 9876543210</li>
                    <li><i class="fas fa-envelope"></i> support@bookmyshow.com</li>
                </ul>
            </div>

            <div class="footer-section social">
                <h3>Follow Us</h3>
                <a href="#"><i class="fab fa-facebook-f"></i></a>
                <a href="#"><i class="fab fa-twitter"></i></a>
                <a href="#"><i class="fab fa-instagram"></i></a>
            </div>
        </div>

        <div class="footer-bottom">
            <p>&copy; 2024 BookMyShow | Designed by Raghvendra Kumar</p>
        </div>
    </footer>

    <script src="script.js"></script>
</body>
</html>