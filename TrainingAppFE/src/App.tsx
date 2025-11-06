import {Home} from "./home/Home.tsx";
import {Header} from "./Layout/Header.tsx";
import {Footer} from "./Layout/Footer.tsx";

function App() {

  return (
    <div className="bg-gradient-to-r from-teal-300 via-blue-200 to-cyan-300 w-screen h-screen flex flex-col items-center justify-between">
      <Header />
      <Home />
      <Footer />
    </div>
  )
}

export default App
