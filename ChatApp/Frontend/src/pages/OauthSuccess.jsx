import { useEffect } from "react";
import { useNavigate, useLocation } from "react-router-dom";

function OAuthSuccess() {
  const navigate = useNavigate();
  const location = useLocation();

  useEffect(() => {
    const query = new URLSearchParams(location.search);
    const token = query.get("token");

    if (token) {
      localStorage.setItem("authToken", token);
      navigate("/dashboard");
    }
  }, [location, navigate]);

  return <p>Redirecting...</p>;
}

export default OAuthSuccess;
