const menu = document.querySelector('.btn-menu');
const menuInterno = document.querySelector('.btn-menu-interno');
const menuBarra = document.querySelector('.menu_desplegable');
const bar = document.querySelector('.bar-rojo');

menu.addEventListener('click', () => {
    // Si el menú principal tiene la clase 'active', alterna la visibilidad de menuBarra
    menuBarra.classList.toggle('hidden');
    // Verifica el estado de `menuBarra`
    ifExist();
});

menuInterno.addEventListener('click', () => {
    // Alterna la visibilidad de menuBarra
    menuBarra.classList.toggle('hidden');
    // Verifica el estado de `menuBarra`
    ifExist();
});

function ifExist() {
    // Si `menuBarra` tiene la clase 'hidden', oculta `menu`
    if (menuBarra.classList.contains('hidden')) {
        menu.classList.remove('hidden');
    } else {
        // Asegura que `menu` esté visible si `menuBarra` no está oculto
        menu.classList.add('hidden');
    }
}

function toggleAction(element, className) {
    element.classList.toggle(className);
}


//Enlaces
const listInside = document.querySelectorAll('.list_inside_click');

console.log(listInside);
listInside.forEach(listElement => {
    listElement.addEventListener('click',()=>{
        const sublista = listElement.nextElementSibling;
        toggleAction(sublista,'hidden');
    });
});