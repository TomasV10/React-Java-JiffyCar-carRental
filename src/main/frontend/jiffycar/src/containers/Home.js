import React from "react";
import Navbar from "../components/Navbar/Navbar";
import HomeContent from "../components/HomeContent";

const Home = () => {
  return (
    <div className="homeContainer">
      <Navbar />
      <HomeContent />
    </div>
  );
};

export default Home;
