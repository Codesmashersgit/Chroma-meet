import React from "react";
import { CiLight } from "react-icons/ci";
import { CiDark } from "react-icons/ci";
import { useState } from "react";
import './App.css';
import Navbar from "./pages/Navbar";
import Login from "./pages/Login";
import Signup from "./pages/Signup";
import Home from "./pages/Home";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import OAuthSuccess from "./pages/OauthSuccess";


function App() {
  return (
    <> 
    
    <BrowserRouter>
    <Navbar />
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/login" element={<Login/>} />
      <Route path="/signup" element={<Signup />} />
       <Route path="/oauth-success" element={<OAuthSuccess/>} />
      </Routes>
    </BrowserRouter>
    </>

  );
}

export default App;
