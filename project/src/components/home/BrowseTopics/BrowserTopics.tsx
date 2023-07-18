import React from "react";
import Card from "./Card";

const BrowserTopics = () => {
  return (
    <section className="container mx-auto">
      <h2 className="text-center text-2xl">Browse Topics</h2>
      <nav className="flex justify-center gap-2 text-md font-semibold">
        <span className="border-b-2 border-blue-400 px-2">tab</span>{" "}
        <span className="border-b-2 border-blue-400 px-2">tab</span>{" "}
        <span className="border-b-2 border-blue-400 px-2">tab</span>{" "}
        <span className="border-b-2 border-blue-400 px-2">tab</span>{" "}
        <span className="border-b-2 border-blue-400 px-2">tab</span>{" "}
      </nav>
      <div className="cards grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 m-12  gap-4">
        {Array.from({ length: 3 }).map(() => (
          <Card />
        ))}
      </div>
    </section>
  );
};

export default BrowserTopics;
