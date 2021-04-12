import FilmTitle from "./FilmTitle";

const FilmsBox = ({films}) => {

    const filmNodes = films.map(film => {
        return (
            <li><FilmTitle filmTitle={film.name} filmLink={film.url} key={film.id}></FilmTitle></li>
        );
    });

    return (
        <>
        <ul>
            {filmNodes}
        </ul>
        </>
    )
}

export default FilmsBox;