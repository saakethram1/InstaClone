import axios from "axios";


export const API_BASE_URL="http://localhost:5454";

const token=localStorage.getItem("jwt");
export const api = axios.create({
    baseURL: API_BASE_URL, 
    headers: {
      'Authorization':`Bearer ${token}`,
      //'Content-Type': 'application/json',
    },
  });

  
  api.interceptors.request.use((config) => {
    const token = localStorage.getItem("jwt"); // Fetch the latest token
    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
  }, (error) => Promise.reject(error));