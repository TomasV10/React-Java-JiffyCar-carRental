import axios from "axios";

const CAR_API_BASE_URL = "http://localhost:8080/api/cars";

class CarService {
  getcars() {
    return axios.get(CAR_API_BASE_URL);
  }

  createCar = (car) => {
    return axios.post(CAR_API_BASE_URL, car);
  };
}

export default new CarService();
