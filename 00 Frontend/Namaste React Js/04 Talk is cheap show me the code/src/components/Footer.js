const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer-section logo-section">
        <img
          src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFrwlx1tQZlR4R7tGELo9g6GAgYOTYHhW5Rw&s"
          alt="Logo"
        />
        <p>Good food, good mood 🍽️</p>
      </div>

      <div className="footer-section">
        <h4>Quick Links</h4>
        <ul className="footer-nav">
          <li>Home</li>
          <li>About Us</li>
          <li>Contact Us</li>
          <li>Cart</li>
        </ul>
      </div>

      <div className="footer-section">
        <h4>Location</h4>
        <p>Anand, Gujarat</p>
      </div>
    </footer>
  );
};

export default Footer;