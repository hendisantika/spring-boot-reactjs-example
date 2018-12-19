import React, {Component} from 'react';
import '../css/App.css';

class Main extends Component {
    ping() {
        console.log("Ping was clicked");
    }

    render() {
        return (
            <div className="Main">
                <header className="App-header">
                    <h1 className="App-title">Ping</h1>
                </header>
                <p className="App-intro">
                    <div>
                        <button onClick={this.ping}>Ping!</button>
                    </div>
                </p>
            </div>
        );
    }

}

export default Main;
