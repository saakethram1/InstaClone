import React, { useEffect, useState } from "react";

import StoryCircle from "../../components/Story/StoryCircle";
import { Avatar, Card, IconButton } from "@mui/material";
import AddPhotoAlternateIcon from "@mui/icons-material/AddPhotoAlternate";
import ImageIcon from "@mui/icons-material/Image";
import VideocamIcon from "@mui/icons-material/Videocam";
import ArticleIcon from "@mui/icons-material/Article";
import AddIcon from "@mui/icons-material/Add";
import { story } from "../../components/Story/StoryData";
import { useDispatch, useSelector } from "react-redux";
import { getAllPost } from "../../Redux/Post/post.action";
import PostCard from "../../components/Post/PostCard";
import CreatePostModal from "../../components/Post/CreatePostModel";

const MiddlePart = () => {
  const [openCreatePostModal, setOpenCreatePostModal] = useState();
  const dispatch = useDispatch();
 // const { post, comment, auth } = useSelector((store) => store);
  const {create} = useSelector((store) => store.comment);
  const { jwt } = useSelector((store) => store.auth); // Extract jwt separately
  const{posts}=useSelector((store)=>store.post)
  const handleOpenCreatePostModal = () => setOpenCreatePostModal(true);
  const handleCloseCreatPostModal = () => setOpenCreatePostModal(false);

  useEffect(() => {

   
      //console.log(jwt,"MArking")
    dispatch(getAllPost());
    console.log(posts,"All Posts")
  }, [create,dispatch, jwt]);

  return (
    <div className="px-20">
      <div className=" py-5 flex items-center bg-[#191c29] p-5 rounded-b-md">
        <div className="flex flex-col items-center mr-4 cursor-pointer">
          <Avatar sx={{ width: "5rem", height: "5rem",bgcolor:"#212534",color:"rgb(88,199,250)" }}>
            <AddIcon sx={{ fontSize: "3rem" }} />
          </Avatar>
          <p>New</p>
        </div>

        {story.map((item) => (
          <StoryCircle
            image={item.image}
            username={item.username}
            userId={item.userId}
          />
        ))}
      </div>
      <div className="card p-5 mt-5">
        <div className="flex justify-between">
          <Avatar sx={{ bgcolor:"#212534",color:"rgb(88,199,250)" }} className="bg-[black]" />
          <input
            onClick={handleOpenCreatePostModal}
            placeholder="Create new post..."
            className="outline-none w-[90%] rounded-full px-5 bg-transparent border border-[#3b4054]"
            readOnly
            type="text"
          />
        </div>
        <div className="flex justify-center space-x-9 mt-5">
          <div className="flex items-center">
            <IconButton color="primary" onClick={handleOpenCreatePostModal}>
              <ImageIcon />
            </IconButton>

            <span>media</span>
          </div>
          <div className="flex  items-center">
            <IconButton color="primary">
              <VideocamIcon />
            </IconButton>

            <span>video</span>
          </div>
          <div className="flex  items-center">
            <IconButton color="primary">
              <ArticleIcon />
            </IconButton>

            <span>Write Article</span>
          </div>
        </div>
        <div></div>
      </div>
      <div className="mt-5 space-y-5">
        {posts.map((item) => (
          <>
            <PostCard item={item} />{" "}
          </>
        ))}
      </div>
      <CreatePostModal
        open={openCreatePostModal}
        handleClose={handleCloseCreatPostModal}
      />
    </div>
  );
};

export default MiddlePart;
