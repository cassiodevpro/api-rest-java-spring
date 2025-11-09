package com.example.apirest.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.apirest.model.Produto;

@Repository
public class ProdutoRepository {

    List<Produto> produtos = new ArrayList<>();
    private Integer ultimoId = 0;

    public List<Produto> obterTodos() {
        return produtos;
    }

    public Optional<Produto> obterPorId(Integer id) {
        return produtos.stream()
                .filter(produto -> produto.getId().equals(id))
                .findFirst();
    }

    public Produto adicionar(Produto produto) {
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }
    public void deletar(Integer id) {
        produtos.removeIf(produto -> produto.getId().equals(id));
    }
    public Produto atualizar(Integer id, Produto produtoAtualizado) {
        Optional<Produto> produtoExistenteOpt = obterPorId(id);
        if (produtoExistenteOpt.isPresent()) {
            Produto produtoExistente = produtoExistenteOpt.get();
            produtoExistente.setNome(produtoAtualizado.getNome());
            produtoExistente.setQuantidade(produtoAtualizado.getQuantidade());
            produtoExistente.setValor(produtoAtualizado.getValor());
            produtoExistente.setObservacao(produtoAtualizado.getObservacao());
            return produtoExistente;
        }
        return null;
    }    
    

}
