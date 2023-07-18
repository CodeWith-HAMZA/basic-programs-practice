import React from "react";

const Card = () => {
  return (
    <div className="flex flex-col p-3 shadow-2xl rounded-xl  ">
      <div className="heading flex justify-between">
        <h1 className="font-bold">Web Design</h1>
        <span>ico</span>
      </div>
      <p className="text-sm my-2 text-gray-500">
        Lorem ipsum dolor sit amet consectetur adipisicing elit
      </p>
      <img src="/img1.jpg" alt="" />
    </div>
  );
};

export default Card;
