package com.example.demo.web;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int p,
                        @RequestParam(name = "size", defaultValue = "5") int s,
                        @RequestParam(name = "mc", defaultValue = "") String mc) { 
        Page<Produit> pageProduits = produitRepository.chercher("%" + mc + "%", PageRequest.of(p, s));
        model.addAttribute("listProduits", pageProduits.getContent());
        int[] pages = new int[pageProduits.getTotalPages()];
        model.addAttribute("pages", pages);
        model.addAttribute("size", s);
        model.addAttribute("pageCourante", p);
        model.addAttribute("motCle",mc);
        return "produits"; 
    }
}