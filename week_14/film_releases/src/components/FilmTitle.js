const FilmTitle = ({filmTitle, filmLink}) => {

    return (
        <a href={filmLink}>{filmTitle}</a>
    )
}

export default FilmTitle;