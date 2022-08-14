const pessoa = {
    nome: 'Maria',
    idade: 29,
    profissao: 'desenvolvedora'
}

pessoa.idade = 26;

const andre: (nome: string, idade: number, profissao: string) = {
    nome: 'Andre',
    idade: 30,
    profissao: 'pintor'
}

const jose: (nome: string, idade: number, profissao: string) = {
    nome: 'Jose',
    idade: 30,
    profissao: 'Desenvolvedor'
}

enum Profissao {
    Professor,
    Atriz,
    Desenvolvedor,
    Vendedor,
    Medico
}

interface Pessoa {
    nome: string,
    idade: number,
    profissao?: Profissao
}

interface Estudante extends Pessoa {
    materias: string[]
}

const vanessa: Pessoa = {
    nome: 'Vanessa',
    idade: 43,
    profissao: Profissao.Professor
}

const marcos: Pessoa = {
    nome: 'Marcos',
    idade: 43,
    profissao: Profissao.Vendedor
}

const jessica: Estudante = {
    nome: 'Jessica',
    idade: 28,
    materias: ['Matemática discreta', 'programação']
}

function listar(lista: string[]) {
    for (const item of lista) {
        console.log('- ', item);
    }
}

listar(jessica.materias);