import React from "react";
import "../css/homeContent.css";
import GeneratedText from "../components/GeneratedText";

const HomeContent = () => {
  return (
    <div className="homeContentContainer">
      <div className="content">
        <div className="city">
          <div className="bground">
            <h1>Car Rental in Kaunas</h1>
          </div>
        </div>
        <div className="row">
          <div className="serviceContainer">
            <div className="service">
              <i className="fas fa-power-off"></i>
              <div className="servicesTxt">POWER</div>
              <GeneratedText />
            </div>
          </div>
          <div className="serviceContainer">
            <div className="service">
              <i className="fas fa-leaf"></i>
              <div className="servicesTxt">GREEN</div>
              <GeneratedText />
            </div>
          </div>
          <div className="serviceContainer">
            <div className="service">
              <i className="fas fa-heart"></i>
              <div className="servicesTxt">CUSTOMER CARE</div>
              <GeneratedText />
            </div>
          </div>
          <div className="serviceContainer">
            <div className="service">
              <i className="fas fa-money-bill-alt"></i>
              <div className="servicesTxt">BEST PRICE</div>
              <GeneratedText />
            </div>
          </div>
        </div>
        <div className="row">
          <div className="serviceContainer">
            <div className="service">
              <i className="fas fa-suitcase"></i>
              <div className="servicesTxt">LOYALTY</div>
              <GeneratedText />
            </div>
          </div>
          <div className="serviceContainer">
            <div className="service">
              <i className="fas fa-wrench"></i>
              <div className="servicesTxt">HARD WORK</div>
              <GeneratedText />
            </div>
          </div>
          <div className="serviceContainer">
            <div className="service">
              <i className="fas fa-star"></i>
              <div className="servicesTxt">PROFESSIONAL TEAM</div>
              <GeneratedText />
            </div>
          </div>
          <div className="serviceContainer">
            <div className="service">
              <i className="fas fa-phone-volume"></i>
              <div className="servicesTxt">24/7 SUPPORT</div>
              <GeneratedText />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default HomeContent;
