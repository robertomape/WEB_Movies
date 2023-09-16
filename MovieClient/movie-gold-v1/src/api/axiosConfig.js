import axios from "axios";

export default axios.create({
    // With this code its connects to the local server,
    // it must be runing the java+spring application to work properly
    baseURL:'http://localhost:8080',
});