const mongoose = require("mongoose");
const { FaBullseye } = require("react-icons/fa");


const userSchema = new mongoose.Schema({
  username: { type: String, required: true, unique: false },
  email: { type: String, required: true,unique: true },
  password: { type: String },
  googleId: { type: String }, // for OAuth
});

module.exports = mongoose.model("user", userSchema);
