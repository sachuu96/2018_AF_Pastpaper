var express = require('express');
var router = express.Router();
var SubjectController = require('./Subject.Controller');

router.post('/',(req,res)=>{
    SubjectController.Insert(req.body).then((data)=>{
        res.status(data.status).send(data.message);
    }).catch((err)=>{
        res.status(err.status).send(err.message);
    });
});

router.get('/',(req,res)=>{
    SubjectController.retrieve().then((data)=>{
        res.status(data.status).send(data.message);
    }).catch((err)=>{
        res.status(err.status).send(err.message);
    });
});

router.get('/:id',(req,res)=>{
    let id = req.params.id;
    SubjectController.retrieveByID(id).then((data)=>{
        res.status(data.status).send(data.message);
    }).catch((err)=>{
        res.status(err.status).send(err.message);
    });
});

router.put('/:id',(req,res)=>{
    let id = req.params.id;
    SubjectController.update(id,req.body).then((data)=>{
        res.status(data.status).send(data.message);
    }).catch((err)=>{
        res.status(err.status).send(err.message);
    });
});

router.delete('/:id',(req,res)=>{
    let id = req.params.id;
    SubjectController.delete(id).then((data)=>{
        res.status(data.status).send(data.message);
    }).catch((err)=>{
        res.status(err.status).send(err.message);
    });
});

module.exports = router;