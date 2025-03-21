import { applyMiddleware, combineReducers,  } from "redux";

import { configureStore } from '@reduxjs/toolkit'

import authReducer from "./Auth/auth.reducer";
import { postReducer } from "./Post/post.reducer";
import commentReducer from "./Comment/comment.reducer";
import { reelsReducer } from "./Reels/reels.reducer";
import { messagesReducer } from "./Message/message.reducers";
import { thunk } from "redux-thunk";

const rootReducers = combineReducers({
  auth: authReducer,
  post: postReducer,
  comment:commentReducer,
  reel:reelsReducer,
  chat:messagesReducer
});

export const store = configureStore({
    reducer: rootReducers,
    middleware: (getDefaultMiddleware) => getDefaultMiddleware().concat(thunk),
  });