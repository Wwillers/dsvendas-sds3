import DataTable from 'components/DataTable';
import Footer from 'components/Footer';
import NavBar from 'components/NavBar';

function App() {
  return (
    <>
      <header>
        <NavBar />
      </header>
      <section className="container">
        <DataTable />
      </section>
      <Footer />
    </>
  );
}

export default App;
