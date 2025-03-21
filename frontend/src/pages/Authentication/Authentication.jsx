import {
    Alert,
    Backdrop,
    Button,
    Card,
    CircularProgress,
    Grid,
    Snackbar,
  } from "@mui/material";
  import React, { useEffect, useState } from "react";
  
  import { Navigate, Route, Routes, useLocation, useNavigate } from "react-router-dom";
  import { Login } from "@mui/icons-material";
  import ResetPasswordRequest from "./ResetPasswordRequest";
  import { useSelector } from "react-redux";
  import ResetPassword from "./ResetPassword";
import RegistrationForm from "./Register";
import LoginForm from './Login'
  
  const Authentication = () => {
    const location = useLocation();
    const navigate = useNavigate();
    const [openSnakbar, setOpenSnakbar] = useState(false);
    const { resetPasswordLink } = useSelector((store) => store.auth);
     const {loading}=useSelector((store) => store.auth)
    const handleClose = () => {
      setOpenSnakbar(false);
    };
  
    useEffect(() => {
      if (resetPasswordLink) {
        setOpenSnakbar(true);
      }
    }, [resetPasswordLink]);
    return (
      <div >
        <Grid container >
          <Grid className="h-screen overflow-hidden" item xs={7}>
            <img
              className="h-full w-full"
              src="https://cdn.pixabay.com/photo/2018/11/29/21/51/social-media-3846597_1280.png"
              alt=""
            />
          </Grid>
          <Grid item xs={5}>
            <div className="px-20 flex flex-col justify-center h-full">
              <div className="">
                <div className="flex flex-col items-center mb-2 ">
                  <div className="logo text-center text-lg">Double Trouble</div>
                  <p className="text-center text-sm w-[70%]">
                    Connecting Lives, Sharing Stories: Your Social World, Your Way
                  </p>
                </div>
  
                <Routes>
                  <Route path="/" element={<RegistrationForm />}/>
                  <Route path="/reset-password-req" element={ <ResetPasswordRequest />}/>
                  <Route path="/reset-password" element={ <ResetPassword />}/>
                  <Route path="/register" element={ <RegistrationForm />}/>
                  <Route path="/login" element={ <LoginForm /> }/>
                  
                </Routes>
  
               
              </div>
            </div>
          </Grid>
        </Grid>
  
        <Snackbar
          anchorOrigin={{ vertical: "top", horizontal: "right" }}
          open={openSnakbar}
          autoHideDuration={6000}
          onClose={handleClose}
        >
          <Alert severity="success" sx={{ width: "100%" }}>
            {resetPasswordLink}
          </Alert>
        </Snackbar>
  
        <Backdrop
          sx={{ color: "#fff", zIndex: (theme) => theme.zIndex.drawer + 1 }}
          open={loading}
          // onClick={handleClose}
        >
          <CircularProgress color="inherit" />
        </Backdrop>
      </div>
    );
  };
  
  export default Authentication;
  