import React from "react";

const NavBar = () => {
  return (
    <div className="container mx-auto py-6 ">
      <header className="flex text-white px-4 justify-between items-center">
        <div className="">LOGO</div>
        <nav className="">
          <div className="justify-center hidden sm:flex items-center gap-2">
            <span>Home</span>
            <span>Home</span>
            <span>Home</span>
            <span>Home</span>
            <span>Home</span>
          </div>
        </nav>
        <div className="">Profile</div>
      </header>
    </div>
  );
};

export default NavBar;
