import React, { Component } from "react";
import CarService from "../services/CarService";
import CreatecarItems from "./CreateCarItems";

class CreateCar extends Component {
  state = {
    carMaker: "",
    carModel: "",
    manuYear: "",
    numOfSeats: "",
    pricePerDay: "",
    rentedFrom: "",
    rentedTo: "",
  };

  saveCar = (e) => {
    e.preventDefault();

    let car = {
      carMaker: this.state.carMaker,
      carModel: this.state.carModel,
      manuYear: this.state.manuYear,
      numOfSeats: this.state.numOfSeats,
      pricePerDay: this.state.pricePerDay,
      rentedFrom: this.state.rentedFrom,
      rentedTo: this.state.rentedTo,
    };
    CarService.createCar(car).then((response) => {
      this.props.history.push("/carlist");
    });
  };

  cancel = () => {
    this.props.history.push("/carlist");
  };

  handleChange = (event) => {
    const { name, value } = event.target;
    this.setState({
      [name]: value,
    });
  };

  render() {
    return (
      <div>
        <h3>Add Car</h3>
        <form>
          {/* {CreatecarItems.map((item, index) => {
            console.log(index);
            return (
              <div key={index} className={item.divClass}>
                <lable>{item.title}</lable>
                <input
                  placeholder={item.placeholder}
                  name={item.name}
                  className={item.cName}
                  //   value={this.state.numOfSeats}
                  onChange={this.handleChange}
                />
              </div>
            );
          })} */}

          <div className="form-group">
            <label>Car Maker</label>
            <input
              placeholder="Car Maker"
              name="carMaker"
              className="form-control"
              value={this.state.carMaker}
              onChange={this.handleChange}
            />
          </div>
          <div className="form-group">
            <label>Car Model</label>
            <input
              placeholder="Car Model"
              name="carModel"
              className="form-control"
              value={this.state.carModel}
              onChange={this.handleChange}
            />
          </div>
          <div className="form-group">
            <label>Manufacturing Year</label>
            <input
              placeholder="Manufacturing Year"
              name="manuYear"
              className="form-control"
              value={this.state.manuYear}
              onChange={this.handleChange}
            />
          </div>
          <div className="form-group">
            <label>Price Per Day</label>
            <input
              placeholder="Price Per Day"
              name="pricePerDay"
              className="form-control"
              value={this.state.pricePerDay}
              onChange={this.handleChange}
            />
          </div>
          <div className="form-group">
            <label>Number Of Seats</label>
            <input
              placeholder="Number Of Seats"
              name="numOfSeats"
              className="form-control"
              value={this.state.numOfSeats}
              onChange={this.handleChange}
            />
          </div>
          <div className="form-group">
            <label>Rented Day From</label>
            <input
              placeholder="Rented Day From"
              name="rentedFrom"
              className="form-control"
              value={this.state.rentedFrom}
              onChange={this.handleChange}
            />
          </div>
          <div className="form-group">
            <label>Rented Day To</label>
            <input
              placeholder="Rented Day To"
              name="rentedTo"
              className="form-control"
              value={this.state.rentedTo}
              onChange={this.handleChange}
            />
          </div>
          <button onClick={this.saveCar}>Save</button>
          <button onClick={this.cancel}>Cancel</button>
        </form>
      </div>
    );
  }
}

export default CreateCar;
