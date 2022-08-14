let anyEstaDeVolta: any;
anyEstaDeVolta = 1;
anyEstaDeVolta = 'teste';
anyEstaDeVolta = false;

let stringTest: string = 'verificar';
stringTest = anyEstaDeVolta;

let unknownValor: unknown;
unknownValor = 3;
unknownValor = 'ola';
unknownValor = true;
unknownValor = 'é isso';

let stringTest2: string = 'agora vai';
/*stringTest2 = unknownValor;*/

if(typeof unknownValor === 'string') {
    stringTest2 = unknownValor;
}


function jogaErro(erro: string, codigo: number): never {
    throw {error: erro, code: codigo};
}

jogaErro('deu erro', 500)