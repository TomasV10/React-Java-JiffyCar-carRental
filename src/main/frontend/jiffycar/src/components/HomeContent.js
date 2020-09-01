import React from "react";
import { Row, Col } from "react-bootstrap";
import GeneratedText from "../components/GeneratedText";
import Footer from "../components/Footer/Footer";
import "../css/homeContent.css";
const HomeContent = () => {
  return (
    <div className="homeContentContainer">
      <div className="city">
        <div className="bground">Car Rental in Kaunas</div>
      </div>
      <Row>
        <Col lg={3} md={6} sm={12}>
          <div className="service">
            <i className="fas fa-power-off"></i>
            <div className="servicesTxt">POWER</div>
            <GeneratedText />
          </div>
        </Col>
        <Col lg={3} md={6} sm={12}>
          <div className="service">
            <i className="fas fa-leaf"></i>
            <div className="servicesTxt">GREEN</div>
            <GeneratedText />
          </div>
        </Col>
        <Col lg={3} md={6} sm={12}>
          <div className="service">
            <i className="fas fa-heart"></i>
            <div className="servicesTxt">CUSTOMER CARE</div>
            <GeneratedText />
          </div>
        </Col>
        <Col lg={3} md={6} sm={12}>
          <div className="service">
            <i className="fas fa-money-bill-alt"></i>
            <div className="servicesTxt">BEST PRICE</div>
            <GeneratedText />
          </div>
        </Col>
      </Row>
      <Row>
        <Col lg={3} md={6} sm={12}>
          <div className="service">
            <i className="fas fa-suitcase"></i>
            <div className="servicesTxt">LOYALTY</div>
            <GeneratedText />
          </div>
        </Col>
        <Col lg={3} md={6} sm={12}>
          <div className="service">
            <i className="fas fa-wrench"></i>
            <div className="servicesTxt">HARD WORK</div>
            <GeneratedText />
          </div>
        </Col>
        <Col lg={3} md={6} sm={12}>
          <div className="service">
            <i className="fas fa-star"></i>
            <div className="servicesTxt">PROFESSIONAL TEAM</div>
            <GeneratedText />
          </div>
        </Col>
        <Col lg={3} md={6} sm={12}>
          <div className="service">
            <i className="fas fa-phone-volume"></i>
            <div className="servicesTxt">24/7 SUPPORT</div>
            <GeneratedText />
          </div>
        </Col>
      </Row>
      <Footer />
    </div>
  );
};

export default HomeContent;
