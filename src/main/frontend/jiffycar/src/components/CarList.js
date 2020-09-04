import React, { Component } from "react";
import CarService from "../services/CarService";

class CarList extends Component {
  state = { carList: [] };

  componentDidMount() {
    CarService.getcars().then((response) => {
      this.setState({ carList: response.data });
    });
  }

  addCar = () => {
    console.log("worked");
    this.props.history.push("/addCar/_add");
  };

  editCar = (id) => {
    this.props.history.push(`/addCar/${id}`);
  };

  deleteCar = (id) => {
    CarService.deleteCar(id).then((res) => {
      this.setState({
        carList: this.state.carList.filter((car) => car.id !== id),
      });
    });
  };
  render() {
    return (
      <div>
        <h1>Car List</h1>
        <h1>
          {this.state.carList.map((car) => (
            <div key={car.id}>
              <div>
                {car.carMaker} {car.carModel}
                {car.manuYear}
                {car.state ? "Rented" : "Available"}
              </div>
              <button onClick={() => this.editCar(car.id)}>Update</button>
              <button onClick={() => this.deleteCar(car.id)}>Delete</button>
            </div>
          ))}
        </h1>
        <button className="add_button fas fa-plus-circle" onClick={this.addCar}>
          Add new Car
        </button>
      </div>
    );
  }
}

export default CarList;
