import Footer from 'components/Footer';
import NavBar from 'components/NavBar';
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <>
      <header>
        <NavBar />
      </header>
      <section className="container">
        <div className="jumbotron">
          <h1 className="display-4">DSVendas</h1>
          <p className="lead">
            Analise o desempenho das suas vendas por diferentes perspectivas
          </p>
          <hr />
          <p>
            Esta aplicação consiste em exibir um dashboard a partir de dados
            fornecidos por um back end construído com Spring Boot. <br />
            <Link className="btn btn-primary btn-large" to="/dashboard">
              Acessar dashboard
            </Link>
          </p>
        </div>
      </section>
      <Footer />
    </>
  );
};

export default Home;
