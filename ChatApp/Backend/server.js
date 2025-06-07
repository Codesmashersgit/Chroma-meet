
const express = require("express");
const passport = require("passport");
const session = require("express-session");
require("dotenv").config();
require("./passport"); // Import config
const mongoose = require("mongoose");
const cors = require("cors");
const jwt = require("jsonwebtoken");



const authRoutes = require("./Routes/authRoute");
const app = express();
app.use(cors());
app.use(express.json());

app.use("/api/auth", authRoutes);



app.use(
  session({
    secret: "your-session-secret",
    resave: false,
    saveUninitialized: false,
  })
);

app.use(passport.initialize());
app.use(passport.session());

// Google OAuth route
app.get("/api/auth/google", passport.authenticate("google", { scope: ["profile", "email"] }));

app.get(
  "/api/auth/google/callback",
  passport.authenticate("google", { failureRedirect: "/login", session: false }),
  (req, res) => {
    const token = jwt.sign({ id: req.user._id }, process.env.JWT_SECRET, {
      expiresIn: "1d",
    });

    // Send token to frontend (you can also redirect with token in URL or as cookie)
    res.redirect(`http://localhost:5000/oauth-success?token=${token}`);
  }
);
mongoose
  .connect(process.env.MONGO_URI)
  .then(() => {
    console.log("MongoDB connected");
    app.listen(process.env.PORT, () => console.log("Server running on port", process.env.PORT));
  })
  .catch((err) => console.error(err));