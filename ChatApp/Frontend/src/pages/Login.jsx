// import React from "react";
// import { FcGoogle } from "react-icons/fc";
// import { Link } from "react-router-dom";

// function Login() {
//   return (
//     <div className="min-h-screen flex items-center justify-center  p-6">
//       <div className="bg-white rounded-xl shadow-lg p-10 max-w-md w-full">
//         <h2 className="text-3xl font-bold text-purple-700 mb-8 text-center">
//           Login to Your Account
//         </h2>

//         <button className="flex items-center justify-center gap-3 w-full border border-gray-300 rounded-lg py-3 text-gray-700 hover:shadow-md transition">
//           <FcGoogle size={24} />
//           Continue with Google
//         </button>

//         <div className="flex items-center my-6">
//           <hr className="flex-grow border-gray-300" />
//           <span className="mx-3 text-gray-400 font-semibold">or</span>
//           <hr className="flex-grow border-gray-300" />
//         </div>

//         <form className="flex flex-col gap-5">
//           <input
//             type="email"
//             placeholder="Email address"
//             required
//             className="border border-gray-300 rounded-lg py-3 px-4 focus:outline-none focus:ring-2 focus:ring-purple-500"
//           />
//           <input
//             type="password"
//             placeholder="Password"
//             required
//             className="border border-gray-300 rounded-lg py-3 px-4 focus:outline-none focus:ring-2 focus:ring-purple-500"
//           />
//           <button
//             type="submit"
//             className="bg-purple-600 text-white py-3 rounded-lg font-semibold hover:bg-purple-700 transition"
//           >
//             Login
//           </button>
//         </form>

//         <p className="mt-6 text-center text-gray-600">
//           Don't have an account?{" "}
//           <Link to="/signup" className="text-purple-600 font-semibold hover:underline">
//             Sign Up
//           </Link>
//         </p>
//       </div>
//     </div>
//   );
// }

// export default Login;

import React, { useState } from "react";
import { FcGoogle } from "react-icons/fc";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";

function Login() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError("");

    try {
      const response = await axios.post("http://localhost:5000/api/auth/login", {
        email,
        password,
      });

      const { token } = response.data;

      // Save token to localStorage or context
      localStorage.setItem("authToken", token);

      // Redirect user after login
      navigate("/dashboard"); // Change to your protected route
    } catch (err) {
      setError(err.response?.data?.message || "Login failed");
    }
  };

  return (
    <div className="min-h-screen flex items-center justify-center p-6">
      <div className="bg-white rounded-xl shadow-lg p-10 max-w-md w-full">
        <h2 className="text-3xl font-bold text-purple-700 mb-8 text-center">
          Login to Your Account
        </h2>

        <button
  onClick={() => window.location.href = "http://localhost:5000/api/auth/google"}
  className="flex items-center justify-center gap-3 w-full border border-gray-300 rounded-lg py-3 text-gray-700 hover:shadow-md transition"
>
  <FcGoogle size={24} />
  Continue with Google
</button>

        <div className="flex items-center my-6">
          <hr className="flex-grow border-gray-300" />
          <span className="mx-3 text-gray-400 font-semibold">or</span>
          <hr className="flex-grow border-gray-300" />
        </div>

        <form onSubmit={handleSubmit} className="flex flex-col gap-5">
          {error && (
            <div className="text-red-500 text-sm text-center">{error}</div>
          )}

          <input
            type="email"
            placeholder="Email address"
            required
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            className="border border-gray-300 rounded-lg py-3 px-4 focus:outline-none focus:ring-2 focus:ring-purple-500"
          />
          <input
            type="password"
            placeholder="Password"
            required
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            className="border border-gray-300 rounded-lg py-3 px-4 focus:outline-none focus:ring-2 focus:ring-purple-500"
          />
          <button
            type="submit"
            className="bg-purple-600 text-white py-3 rounded-lg font-semibold hover:bg-purple-700 transition"
          >
            Login
          </button>
        </form>

        <p className="mt-6 text-center text-gray-600">
          Don't have an account?{" "}
          <Link
            to="/signup"
            className="text-purple-600 font-semibold hover:underline"
          >
            Sign Up
          </Link>
        </p>
      </div>
    </div>
  );
}

export default Login;
