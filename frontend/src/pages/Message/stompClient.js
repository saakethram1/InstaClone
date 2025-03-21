import SockJS from "sockjs-client";
import Stomp from "stompjs";

let stompClient = null;

export const connectWebSocket = () => {
  const sock = new SockJS("http://localhost:5454/ws");
  stompClient = Stomp.over(sock);
  stompClient.connect({}, () => {
    console.log("WebSocket connected");
  }, (err) => {
    console.error("WebSocket connection error:", err);
  });
};

export const getStompClient = () => stompClient;

export const disconnectWebSocket = () => {
  if (stompClient) {
    stompClient.disconnect();
    console.log("WebSocket disconnected");
  }
};
