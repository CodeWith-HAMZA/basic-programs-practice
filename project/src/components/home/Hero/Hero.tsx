import React from "react";
import NavBar from "./NavBar";

const Hero = () => {
  return (
    <>
      <div className="container mx-auto bg-gradient-to-bl from-[rgba(0,155,134,0.75)] via-[rgba(3,173,185,0.99)] to-[rgba(3,98,105,0.99)] text-white">
        <NavBar />
        <hr />

        <div className="flex flex-col gap-4 justify-center items-center pt-12 py-24">
          <h1 className="font-bold text-4xl">Discover Learn And Enjoy</h1>
          <p className="text-blue-600">
            Lorem ipsum dolor, sit amet consectetur adipisicing.
          </p>
          <div className="text-black flex items-center justify-between md:w-[34rem] px-2.5 py-2 gap-2 rounded-full bg-white">
            <span className="text-gray-400">Search</span>
            <input
              type="text"
              name=""
              className="px-3 py-1 w-full outline-none border-none"
              id=""
            />
            <span className="px-6 py-2 bg-purple-400 rounded-full">Search</span>
          </div>
        </div>
      </div>
      <div className="container mx-auto bg-purple-200 min-h-[21rem] rounded-b-[5rem]">
        <div className="content relative top-[-3rem]   justify-center">
          <div className="grid grid-cols-1 sm:grid-cols-12 gap-3 text-white">
            <div className="text-black col-span-3 col-start-3 rounded-xl bg-white  shadow-md min-h-[10rem] p-3">
              <div className=" flex  justify-between">
                <h1 className="  font-semibold text-md">Web Design</h1>
                <span>ico</span>
              </div>
              <p className="text-sm text-gray-500">
                Lorem ipsum dolor sit amet consectetur, adipisicing elit. Dolore
                sunt odio
              </p>
              <img src="/img1.jpg" alt="" />
            </div>
            <div
              className="financeBox relative text-white col-span-5 p-3 rounded-xl "
              style={{}}
            >
              <div className="bgDiv "></div>

              <div className="relative flex flex-col">
                <div className="flex justify-between">
                  <h1 className="text-md font-semibold">Finance</h1>
                  <div>ico</div>
                </div>
                <p className=" text-xs">
                  Lorem ipsum dolor sit, amet consectetur adipisicing elit.
                  Pariatur, tempore!.
                </p>
                <button className="self-start mt-6 bg-[rgba(39,205,255,0.7931034482758621)] rounded-full text-xs font-bold px-3 py-1.5">
                  Learn more
                </button>

                <div className="flex mt-28 text-xs justify-between">
                  <div className="flex gap-3">
                    <span>Share: </span>
                    <span>ico </span>
                    <span>ico </span>
                    <span>ico </span>
                  </div>
                  <span>ico</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default Hero;
