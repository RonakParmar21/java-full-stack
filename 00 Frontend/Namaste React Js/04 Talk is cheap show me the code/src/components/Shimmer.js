const Shimmer = () => {
  return (
    <div className="shimmer-container">
      {Array(5).fill("").map((_, i) => (
        <div className="shimmer-cards" key={i}>
          <div className="shimmer shimmer-img"></div>

          <div className="shimmer-content">
            <div className="shimmer shimmer-title"></div>
            <div className="shimmer shimmer-text"></div>

            <div className="shimmer-meta">
              <div className="shimmer shimmer-badge"></div>
              <div className="shimmer shimmer-time"></div>
            </div>
          </div>
        </div>
      ))}
    </div>
  );
};

export default Shimmer;
