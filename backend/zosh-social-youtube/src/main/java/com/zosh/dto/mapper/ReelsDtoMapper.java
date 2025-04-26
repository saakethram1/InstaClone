package com.zosh.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.zosh.dto.ReelsDto;
import com.zosh.dto.UserDto;
import com.zosh.models.Reels;


public class ReelsDtoMapper {
	
	
	public static ReelsDto toReelsDto(Reels reel) {
		ReelsDto reelsDto=new ReelsDto();
		
		  if (reel.getUser() != null) {
		        UserDto user = UserDtoMapper.userDTO(reel.getUser());
		        reelsDto.setUser(user);
		    } else {
		        reelsDto.setUser(null);  // Handle missing user gracefully
		    }
		
		reelsDto.setTitle(reel.getTitle());
		//reelsDto.setUser(user);
		reelsDto.setVideo(reel.getVideo());
		reelsDto.setId(reel.getId());
		
		return reelsDto;
		
	}
	
	public static List<ReelsDto> toReelsDtos(List<Reels> reels){
		
		List<ReelsDto> reelsDtos=new ArrayList<>();
		
		for(Reels reel : reels ) {
		    System.out.println("DEBUG: Reel ID " + reel.getId() + " User: " + reel.getUser());

			 ReelsDto reelsDto=toReelsDto(reel);
			 reelsDtos.add(reelsDto);
		}
		
		return reelsDtos;
		
	}

}
