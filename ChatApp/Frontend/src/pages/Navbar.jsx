
import React from 'react';
import { Link } from 'react-router-dom';

function Navbar() {
  return (
    <div className="navbar shadow-md fixed top-0 right-0 w-full flex items-center justify-between px-4 py-2 transition-all duration-300 bg-white z-50">
     <Link to='/'><div className="logo flex items-center gap-2">
        <img
          src="https://png.pngtree.com/template/20190530/ourmid/pngtree-letter-c-logo-vector-image_204408.jpg"
          alt="ChromaMeet Logo"
          className="h-[70px] w-auto"
        />
        <h1 className="text-[30px] font-bold text-purple-600">
          Chroma<span className="text-black text-xl">meet</span>
        </h1>
      </div>
      </Link>

      <div className="icon flex gap-4 mr-5">
        <Link
          to="/login"
          className="bg-purple-600 text-white px-4 py-2 rounded-md hover:bg-purple-700 transition"
        >
          Login
        </Link>
      </div>
    </div>
  );
}

export default Navbar;
