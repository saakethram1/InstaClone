
import './App.css';
import Message from './pages/Message/Message';
import Authentication from './pages/Authentication/Authentication';
import { useDispatch, useSelector,  } from 'react-redux';
import { useEffect } from 'react';
import { getUserProfile } from './Redux/Auth/auth.action';
import PasswordChangeSuccess from './pages/Authentication/PasswordChangeSuccess';
import VideoCall from './components/Message/VideoCall';
import Demo from './pages/Message/Demo';
import VideoCalling from './components/Message/VideoCalling';

import darkTheme from './theam/DarkTheam';
import { ThemeProvider } from '@mui/material';
import HomePage from './pages/Homepage/HomePage';
import { BrowserRouter, Route, Routes } from 'react-router-dom';


function App() {
  const dispatch=useDispatch();
  const { jwt } = useSelector((store) => store.auth); // Extract jwt separately
  const {user}=useSelector((store)=>store.auth)
  useEffect(() => {
    const storedJwt = localStorage.getItem("jwt");
    if (storedJwt && !user) {
   dispatch(getUserProfile(storedJwt));
    }
    console.log(user,"Updated User");
  }, [dispatch,jwt, user]);
  return (
    <ThemeProvider theme={darkTheme}>
    <BrowserRouter>
      <Routes>
        <Route path='/*' element={user? <HomePage/>:<Authentication/>}/>

        <Route path="/messages" element={<Message/>} />
       
        <Route path="/password-change-success" element={<PasswordChangeSuccess/>} />
        <Route path='/video-call' element={<VideoCall/>}/>
        <Route path='/demo' element={<Demo/>}/>
        <Route path='/video-calling' element={<VideoCalling/>}/>
      </Routes>
      </BrowserRouter>
    </ThemeProvider>
  );
}

export default App;
