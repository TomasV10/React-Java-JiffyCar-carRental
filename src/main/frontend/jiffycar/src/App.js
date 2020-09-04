import React from "react";
import "./App.css";
import Navbar from "./components/Navbar/Navbar";
import Footer from "./components/Footer/Footer";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import CarList from "./components/CarList";
import HomeContent from "./components/HomeContent";
import CreateCar from "./components/CreateCar";

function App() {
  return (
    <div>
      <Router>
        <Navbar />
        <Switch>
          <Route path="/" exact component={HomeContent}></Route>
          <Route path="/carlist" component={CarList}></Route>
          <Route path="/addCar/:id" component={CreateCar}></Route>
        </Switch>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
