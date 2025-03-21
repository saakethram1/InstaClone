import React, { useEffect } from "react";
import { Avatar, Button, Divider, Menu, MenuItem } from "@mui/material";
import MoreHorizIcon from "@mui/icons-material/MoreHoriz";
import { useNavigate } from "react-router-dom";
import { SidebarNavigation ,icons} from "./SidebarNavigation";
import { useDispatch, useSelector } from "react-redux";
import { logout } from "../../Redux/Auth/auth.action";


const Sidebar = () => {
  const [anchorEl, setAnchorEl] = React.useState(null);
  const openLogoutMenu = Boolean(anchorEl);
  const { user} = useSelector((store) => store.auth);

  const navigate = useNavigate();
  const dispatch=useDispatch();

  const handleOpenLogoutMenu = (event) => {
    setAnchorEl(event.currentTarget);
  };
  const handleClose = () => {
    setAnchorEl(null);
  };

  useEffect(()=>{
    console.log(user,"User")
  },[])

  const handleLogout = () => {
    dispatch(logout(navigate))
    handleClose();
   
  };
  return (
    <div className="card h-screen flex flex-col justify-between py-5">
      <div className="space-y-8 ">
        <div className="">
          <span className="logo">Zosh Social</span>
        </div>
        <div className="space-y-8">
          {SidebarNavigation.map((item) =>   
           {
            const IconComponent = icons[item.icon];

            return(
              
               <div
              onClick={() =>
                item.title === "Profile"
                  ? navigate(`/profile/${user.id}`)
                  : navigate(`${item.path}`)
              }
              className="cursor-pointer flex  space-x-3 items-center"
            >
               <IconComponent />
              <p className="text-xl">{item.title}</p>
            </div>)}
          )}
        </div>
      </div>
      <div>
        <Divider />
        <div className="pl-5 flex items-center  justify-between pt-5">
          <div className="flex items-center space-x-3">
            <Avatar
              alt="Remy Sharp"
              src={user?.image}
            />

            <div>
              <p className="font-bold">{user?.firstName +" "+ user?.lastName}</p>
              <p className="opacity-70">{user?.firstName}</p>
            </div>
          </div>
          <Button
            id="basic-button"
            aria-controls={openLogoutMenu ? "basic-menu" : undefined}
            aria-haspopup="true"
            aria-expanded={openLogoutMenu ? "true" : undefined}
            onClick={handleOpenLogoutMenu}
          >
            <MoreHorizIcon />
          </Button>
          <Menu
            id="basic-menu"
            anchorEl={anchorEl}
            open={openLogoutMenu}
            onClose={handleClose}
            MenuListProps={{
              "aria-labelledby": "basic-button",
            }}
          >
            <MenuItem onClick={handleLogout}>Logout</MenuItem>
          </Menu>
        </div>
      </div>
    </div>
  );
};

export default Sidebar;
