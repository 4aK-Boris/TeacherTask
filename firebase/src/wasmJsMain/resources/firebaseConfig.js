import { initializeApp } from "firebase/app";

const firebaseConfig = {
  apiKey: "AIzaSyBXlUZRFfYC4unthwftcTYcUFHvUZ-yDEw",
  authDomain: "teachertask1124.firebaseapp.com",
  projectId: "teachertask1124",
  storageBucket: "teachertask1124.appspot.com",
  messagingSenderId: "356272077223",
  appId: "1:356272077223:web:c15399edbf176f33b81e82"
};

const app = initializeApp(firebaseConfig);

export { app };