const podeEntrar = require('./balada');

test('Teste vazio', () => {
  podeEntrar(25);
});

test('Teste inútil', () => {
  expect(true).toBe(true);
});


test('Deve permitir entrada de adulto', () => {
  expect(podeEntrar(25)).toBe(true);
});

test('Deve permitir entrada exata de 18 anos', () => {
  expect(podeEntrar(18)).toBe(true);
});

test('Não deve permitir entrada de menor de idade', () => {
  expect(podeEntrar(17)).toBe(false);
});



// npm run test:coverage
// npx stryker run
