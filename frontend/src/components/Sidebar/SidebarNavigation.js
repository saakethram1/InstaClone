import HomeIcon from '@mui/icons-material/Home';
import ExploreIcon from '@mui/icons-material/Explore';
import ControlPointIcon from '@mui/icons-material/ControlPoint';
import NotificationsIcon from '@mui/icons-material/Notifications';
import MessageIcon from '@mui/icons-material/Message';
import GroupIcon from '@mui/icons-material/Group';
import ListAltIcon from '@mui/icons-material/ListAlt';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';

// Store the icon components in an object
export const icons = {
  HomeIcon,
  ExploreIcon,
  ControlPointIcon,
  NotificationsIcon,
  MessageIcon,
  GroupIcon,
  ListAltIcon,
  AccountCircleIcon,
};

// Define the navigation items without JSX
export const SidebarNavigation = [
  {
    title: "Home",
    icon: "HomeIcon", // Reference the icon by key
    path: "/"
  },
  {
    title: "Reels",
    icon: "ExploreIcon",
    path: "/reels"
  },
  {
    title: "Create Reels",
    icon: "ControlPointIcon",
    path: "/create-reels"
  },
  {
    title: "Notifications",
    icon: "NotificationsIcon",
    path: "/notifications"
  },
  {
    title: "Message",
    icon: "MessageIcon",
    path: "/messages"
  },
  {
    title: "Lists",
    icon: "ListAltIcon",
    path: "/lists"
  },
  {
    title: "Communities",
    icon: "GroupIcon",
    path: "/communities"
  },
  {
    title: "Profile",
    icon: "AccountCircleIcon",
    path: "/profile"
  },
];