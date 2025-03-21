import { Avatar } from '@mui/material'
import React from 'react'
import AddIcon from '@mui/icons-material/Add';

const StoryCircle = () => {
  return (
    <div>
       <div className='flex flex-col items-center mr-4 cursor-pointer'>
                    <Avatar sx={{ width: "5rem", height: "5rem" }}
                        src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_NP3oLueY6_SEZN9omHntEoHpaZ-5eZUYIg&s"
                    >
                        <AddIcon sx={{ fontSize: "3rem" }} />
                    </Avatar>
                    <p>Codewith....</p>
                </div>
    </div>
  )
}

export default StoryCircle
