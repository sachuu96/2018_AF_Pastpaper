const mongoose = require('../DBSchema/SchemaMapper');
const Subject = mongoose.model('Subject');

var SubjectController = function(){
    this.Insert = (data)=>{
        return new Promise((resolve,reject)=>{
            let subject = new Subject({
                Name:data.Name,
                Description:data.Description,
                Amount:data.Amount
            });
            subject.save().then(()=>{
                resolve({status:200,message:'Subject added successfully'});
            }).catch((err)=>{
                reject({status:200,message:'Subject creation failed due to Error: '+err});
            });
        })
    };

    this.retrieve = ()=>{
        return new Promise((resolve,reject)=>{
            Subject.find().then((data)=>{
                resolve({status:200,message:data});
            }).catch((err)=>{
                reject({status:500,message:'No data to be found. Error: '+err});
            })
        });
    };

    this.retrieveByID = (id)=>{
        return new Promise((resolve,reject)=>{
            Subject.findById(id).then((data)=>{
                resolve({status:200,message:data});
            }).catch((err)=>{
                reject({status:500,message:'No data to be found. Error: '+err});
            })
        });
    };

    this.update = (id,data)=>{
        return new Promise((resolve,reject)=>{

            let subject = {
                Name:data.Name,
                Description:data.Description,
                Amount:data.Amount
            };
            Subject.findByIdAndUpdate({_id: id},subject).then(()=>{
                resolve({status:200,message:'Subject updated successfully'});
            }).catch((err)=>{
                reject({status:500,message:'Subject updating failed due to Error: '+err});
            });
        })
    };

    this.delete = (id)=>{
        return new Promise((resolve,reject)=>{
            Subject.findByIdAndDelete(id).then(()=>{
                resolve({status:200,message:'Deletion Successful'});
            }).catch((err)=>{
                reject({status:500,message:'No data to be found. Error: '+err});
            })
        });
    }
};

module.exports = new SubjectController();