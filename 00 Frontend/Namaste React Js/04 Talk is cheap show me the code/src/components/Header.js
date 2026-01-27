import { LOGO_URL } from "../utils/constants";

export const Header = () => {
  return (
    <header className="header">
      <div className="logo-container">
        <img
          src={LOGO_URL}
          alt="Logo"
        />
      </div>

      <nav className="nav-container">
        <ul className="nav-list">
          <li>Home</li>
          <li>About Us</li>
          <li>Contact Us</li>
          <li className="cart">Cart</li>
        </ul>
      </nav>
    </header>
  );
};

export default Header;
