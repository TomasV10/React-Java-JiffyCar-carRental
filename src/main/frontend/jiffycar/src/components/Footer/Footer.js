import React, { Component } from "react";
import GeneratedText from "../GeneratedText";
class Footer extends Component {
  state = {};
  render() {
    return (
      <div className="footerContainer">
        <div className="row footer">
          <div className="contactUs">
            <h4>CONTACTS</h4>
            <div>
              <i className="fas fa-phone"></i>+370(6)25474
            </div>
            <div>
              <i className="fas fa-envelope"></i>info@jiffycar.com
            </div>
            <div>
              <i className="fas fa-home"></i>Jonavos g. 60c, Kaunas 44192
            </div>
          </div>
          <div className="aboutUs">
            <h4>ABOUT</h4>
            <GeneratedText />
          </div>
          <div className="newsletter">
            <h4>NEWSLETTER</h4>
            <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</div>
            <div>Subscribe!</div>
            <div className="email_input">
              <input
                type="text"
                className="form-control email_field"
                placeholder="Email"
              />
              <div className="email_input_go">
                <span>
                  <button type="button" className="button_go">
                    Subscribe!
                  </button>
                </span>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Footer;
