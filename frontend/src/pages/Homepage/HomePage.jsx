import { Grid } from "@mui/material";
import React from "react";
import { Route, Routes, useLocation } from "react-router-dom";
import { useSelector } from "react-redux";
import MiddlePart from "./MiddlePart";
import Sidebar from "../../components/Sidebar/Sidebar";
import CreatePostModal from "../../components/Post/CreatePostModel";
import Profile from "../Profile/Profile";
import HomeRight from "../../components/HomeRight";
import Reels from "../Reels/Reels";
import CreateReelsForm from "../Reels/CreateReelsForm";
import { Button } from '@mui/material';



const HomePage = () => {
  const location = useLocation();
  const { user } = useSelector((store) => store.auth);

  return (
    <div className="flex  h-screen overflow-visible ">
    {/* <Button variant="contained" color="primary">Themed Button</Button> */}

      {/* Sidebar (Hidden on small screens) */}
      <div className="w-1/5">
      <div className="hidden lg:flex  xl:w-1/5 h-full fixed  left-0 top-0">
        <Sidebar />
      </div>
      </div>

      {/* Middle Part (Scrollable) */}
      <div className="flex h-full  w-3/5  items-center flex-col ">
     <Routes>
     <Route path="/" element={<MiddlePart />} />
     <Route path="/reels" element={<Reels />} />
     <Route path="/create-reels" element={<CreateReelsForm />} />
     <Route   path="/profile/:id" element={<Profile />} />
    </Routes>
   </div>

    <div>
      {/* HomeRight (Hidden on small screens) */}
      {location.pathname === "/" && (
        <div className="hidden lg:flex w-1/4 xl:w-1/5 h-full fixed right-0 top-0">
          <HomeRight />
        </div>
      )}
     
      </div>
    </div>
  );
};

export default HomePage;
