import { Avatar, Box, Button, Card, Tab, Tabs } from "@mui/material";
import React, { useEffect, useState } from "react";
import ProfileModel from "./ProfileModel";
import { useDispatch, useSelector } from "react-redux";
import { findUserById } from "../../Redux/Auth/auth.action";
import { useParams } from "react-router-dom";
import { getUsersPost } from "../../Redux/Post/post.action";
import UsersReelCard from "../Reels/UsersReelCard";
import { getUsersReels } from "../../Redux/Reels/reels.acton";
import PostCard from "../../components/Post/PostCard";


const tabs = [
  { value: "post", name: "Post" },
  { value: "reels", name: "Reels" },
  { value: "saved", name: "Saved" },
  { value: "repost", name: "Repost" },
];

const Profile = () => {
  const handleFollowUser = () => console.log("handle follow user");
  const [value, setValue] = React.useState("post");
  const [openModel, setOpenModal] = useState(false);
  const dispatch = useDispatch();
  const { id } = useParams();
  const { auth , post,reel} = useSelector((store) => store);
  const {findUser ,user} = useSelector((store) => store.auth);
  const{posts}=useSelector((store)=>store.post)

  const handleCloseProfileModal = () => setOpenModal(false);
  const handleOpenProfileModal = () => setOpenModal(true);

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };
  useEffect(() => {
    console.log("User",)
    dispatch(findUserById(id));
    dispatch(getUsersPost(id))
    dispatch(getUsersReels(id))

  }, [id,]);
  return (
    <div className="ml-10">
    <div className="flex ">
      <div className="rounded-md flex flex-col items-center  bg-[#191c29]">
        <div className=" h-[15rem]">
          <img
            className="w-full h-full rounded-t-md"
            src="https://cdn.pixabay.com/photo/2014/01/13/20/01/pebbles-243910_640.jpg"
            alt=""
          />
        </div>
        <div className="px-5 flex justify-between items-start mt-5 h-[5rem]">
          <Avatar
            alt="Avatar"
           src={findUser?.image}
            className="transform -translate-y-24 "
            sx={{ width: "10rem", height: "10rem", bgcolor:"#212534",color:"rgb(88,199,250)" }}
            color="primary"
          />
          {auth.user?.id===auth.findUser?.id ? (
            <Button
              onClick={handleOpenProfileModal}
              sx={{ borderRadius: "20px" }}
              variant="outlined"
              className="rounded-full"
            >
              Edit Profile
            </Button>
          ) : (
            <Button
              onClick={handleFollowUser}
              sx={{ borderRadius: "20px" }}
              variant="outlined"
              className="rounded-full"
            >
              {true ? "Unfollow" : "Follow"}
            </Button>
          )}
        </div>
        <div className="p-5">
          <div>
            <h1 className="py-1 font-bold text-xl">{findUser?.firstName+" "+findUser?.lastName}</h1>
            <p>
              @
              {findUser?.firstName?.toLowerCase() +
                "_" +
                findUser?.lastName?.toLowerCase()}
            </p>
          </div>
          <div className="flex space-x-5 items-center py-3">
            <span>{posts.length} posts</span>
            <span> {user.follower.length}  followers</span>
            <span>{user.following.length} following</span>
          </div>
          <div className="">
            <p>{findUser?.bio} </p>
          </div>
        </div>
        <section>
          <Box sx={{ width: "100%", borderBottom: 1, borderColor: "divider" }}>
            <Tabs
              value={value}
              onChange={handleChange}
              aria-label="wrapped label tabs example"
            >
              {tabs.map((item) => (
                <Tab value={item.value} label={item.name} wrapped />
              ))}
            </Tabs>
          </Box>
          <div className="flex justify-center">
           <div className="flex w-[900px]">
            {value === "post" ? (
              <div className="space-y-5 w-full mx-20  my-10">
                {post.posts.map((item) => (
                  <div className="border border-[#3b4054] rounded-md">
                    <PostCard item={item}/>{" "}
                  </div>
                ))}
              </div>
            ) : value === "repost" ? (
              <div>Repost</div>
            ) : value === "reels" ? (
              <div className="flex flex-wrap py-5">
                
                 {reel.reels.map((reel) => (
                  <UsersReelCard reel={reel} />
                ))}
              </div>
            ) : (
              <div>{auth.findUser?.savedPosts.map((item)=><PostCard item={item}/>)}</div>
            )}
            </div>
          </div>
        </section>
      </div>
      <section>
        <ProfileModel open={openModel} handleClose={handleCloseProfileModal} />
      </section>
    </div>
    </div>
  );
};

export default Profile;
