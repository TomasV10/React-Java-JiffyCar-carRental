import React, { Component } from 'react';

class CarList extends Component {
    state = { carList: [] }

    componentDidMount(){
        fetch("http://localhost:8080/api/cars")
        .then(response => response.json())
        .then(response => {
            console.log(response);
            this.setState({
                carList: response
            })
        })
    }

    render() { 
        return ( 
            <div>
                <h1>Tomas</h1>
            </div>
         );
    }
}
 
export default CarList;